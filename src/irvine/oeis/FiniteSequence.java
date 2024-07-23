package irvine.oeis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Base case for certain finite sequences generated verbatim from a list of integer values.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class FiniteSequence extends AbstractSequence implements Serializable, DirectSequence {

  /** Default offset. */
  public static final int DEFOFF = 0;
  private int mOffset = DEFOFF;
  private int mN = 0;
  private final ArrayList<Z> mList;
  protected String mAttr; // attribute: one of the following
  protected static final String FINITE = "finite";
  protected static final String NONCOMPUTABLE = "noncomputable";
  protected static final String BRIEF = "brief";
  protected static final String PAD_ZERO = "pad_zero";

  /**
   * Construct an empty sequence.
   */
  public FiniteSequence() {
    super(DEFOFF);
    mAttr = FINITE;
    mList = new ArrayList<>();
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public FiniteSequence(final int offset, final String attr, final int... seq) {
    super(offset);
    mOffset = offset;
    mAttr = attr;
    mList = new ArrayList<>();
    for (final long t : seq) {
      mList.add(Z.valueOf(t));
    }
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public FiniteSequence(final int offset, final String attr, final long... seq) {
    super(offset);
    mOffset = offset;
    mAttr = attr;
    mList = new ArrayList<>();
    for (final long t : seq) {
      mList.add(Z.valueOf(t));
    }
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public FiniteSequence(final int offset, final String attr, final Z... seq) {
    super(offset);
    mOffset = offset;
    mAttr = attr;
    mList = new ArrayList<>(Arrays.asList(seq));
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public FiniteSequence(final int offset, final String attr, final String seq) {
    this(offset, attr, ZUtils.toZ(seq));
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final int offset, final String attr, final Collection<Z> seq) {
    super(offset);
    mAttr = attr;
    mList = new ArrayList<>(seq);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final int... seq) {
    this(DEFOFF, FINITE, seq);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final long... seq) {
    this(DEFOFF, FINITE, seq);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Z... seq) {
    this(DEFOFF, FINITE, Arrays.asList(seq));
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Collection<Z> seq) {
    this(DEFOFF, FINITE, seq);
  }

  @Override
  public Z next() {
    return mN < mList.size() ? mList.get(mN++) : (PAD_ZERO.equals(mAttr) ? Z.ZERO : null);
  }

  /**
   * Directly return the specified element of this sequence.
   * @param index index (from 0)
   * @return specified element
   */
  public Z a(final int index) {
    return mList.get(index - mOffset);
  }

  /**
   * Directly return the specified element of this sequence.
   * @param index index (from 0)
   * @return specified element
   */
  public Z a(final Z index) {
    return mList.get(index.intValueExact() - mOffset);
  }

  /**
   * Get the finite list of terms.
   * @return array of terms
   */
  public Z[] getInitTerms() {
    return mList.toArray(new Z[0]);
  }

  /**
   * Get the number of terms in the finite list.
   */
  public int size() {
    return mList.size();
  }

  /**
   * Get the attribute of the list.
   * @return one of <code>FINITE, NOMCOMPUTABLE, BRIEF, PAD_ZERO</code>
   */
  public String getAttribute() {
    return mAttr;
  }

  /**
   * Get a String representation of the list.
   * @return comma-separated list of the terms
   */
  public String toString(final String separator) {
    final StringBuilder result = new StringBuilder();
    for (int i = 0; i < size(); ++i) {
      if (i > 0) {
        result.append(separator);
      }
      result.append(mList.get(i));
    }
    return result.toString();
  }

  /**
   * Get a String representation of the list.
   * @return comma-separated list of the terms
   */
  public String toString() {
    return toString(",");
  }

  /**
   * Add a value to the list.
   * @param val value
   */
  public void add(final Z val) {
    mList.add(val);
  }
}
