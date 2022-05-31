package irvine.oeis;

import java.util.ArrayList;
import java.util.function.Function;

import irvine.math.z.Z;

/**
 * A recurrence equation set for <code>a(n)</code> depending on <code>a(f(n)), f(n) &lt; n</code>.
 * The recurrence may be specified by a single, a pair, a triple and so on of lambda expressions
 * for <code>[a(n)], [a(2*n), a(2*n+1)], [a(3*n), a(3*n+1), a(3*n+2)]</code> and so on.
 * @author Georg Fischer
 */
public class GeneralRecurrence extends MemorySequence {

  protected int mN; // index of the next sequence element to be computed
  protected int mOffset; // index of the first sequence element
  protected ArrayList<Function<Integer, Z>> mLambda; // tuple of lambda expressions 
  protected int mNTuple; // length of mLambda: 1 for single, 2 for pair, 3 for triple of lambda expressions
  protected int mInitLen; // number of initial terms

  /**
   * Empty constructor.
   */
  protected GeneralRecurrence() {
    this(0, 1, 1, 1, 1); // A006720
  }

  /**
   * Construct a general recurrence sequence from lambda expressions.
   * @param offset first valid term has this index
   * @param initTerms initial values of <code>a[0..k]</code>
   */
  public GeneralRecurrence(final int offset, final long... initTerms) {
    super(offset, initTerms);
    mOffset = offset;
    mN = offset - 1;
    mLambda = new ArrayList<>();
    mInitLen = initTerms.length;
    initialize();
    mNTuple = mLambda.size(); // number of n-section
  }

  /**
   * Initialize the sequence, assign the lambda expression(s).
   * This code is common to all constructors.
   * The number of added lambda expressions gives the number of n-sections of the recurrence.
   */
  protected void initialize() {
    mLambda.add(n -> a(n - 1).multiply(a(n - 3)).add(a(n - 2).square()).divide(a(n - 4))); // (1,1) Somos-4
  }

  /**
   * Gets the next term of the sequence.
   * @return an initial term or the next element computed by the recurrence
   */
  @Override
  public Z computeNext() {
    final int n = size();
    if (mNTuple == 1) {
      return mLambda.get(0).apply(n);
    }
    final int m = mN / mNTuple; // e.g. n = 3*m
    return mLambda.get(n % mNTuple).apply(m);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
