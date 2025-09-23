package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A080517 T is the first, third, eighth, ninth, fifteenth, nineteenth, ... consonant in this sentence.
 * @author Sean A. Irvine
 */
public class A080517 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final String mLetter;
  private int mN = 0;

  protected A080517(final char letter, final String text) {
    mLetter = String.valueOf(letter);
    mA.append(' ').append(letter).append(text);
  }

  protected A080517(final char letter) {
    this(letter, "sth"); // (i)sth(e)
  }

  /** Construct the sequence. */
  public A080517() {
    this('t');
  }

  @Override
  public Z next() {
    mN = mA.indexOf(mLetter, mN + 1);
    mA.append(English.SINGLETON.toOrdinalText(mN).replace(" and ", "").replaceAll("[- ,aeiouy]", ""));
    //System.out.println(mA);
    return Z.valueOf(mN);
  }
}

