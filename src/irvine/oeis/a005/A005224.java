package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A005224 T is the first, fourth, eleventh, ... letter in this sentence, not counting spaces or commas (Aronson's sequence).
 * @author Sean A. Irvine
 */
public class A005224 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final String mLetter;
  private int mN = 0;

  protected A005224(final char letter) {
    mLetter = String.valueOf(letter);
    mA.append(' ').append(letter).append("isthe");
  }

  /** Construct the sequence. */
  public A005224() {
    this('t');
  }

  @Override
  public Z next() {
    mN = mA.indexOf(mLetter, mN + 1);
    mA.append(English.SINGLETON.toOrdinalText(mN).replace(" and ", "").replaceAll("[- ,]", ""));
    //System.out.println(mA);
    return Z.valueOf(mN);
  }
}

