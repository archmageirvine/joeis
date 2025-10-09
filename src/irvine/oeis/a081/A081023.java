package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A005224 T is the first, fourth, eleventh, ... letter in this sentence, not counting spaces or commas (Aronson's sequence).
 * @author Sean A. Irvine
 */
public class A081023 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final char mLetter;
  private int mN = 0;

  protected A081023(final char letter, final String text) {
    mLetter = letter;
    mA.append(' ').append(letter).append(text);
  }

  protected A081023(final char letter) {
    this(letter, "isthe");
  }

  /** Construct the sequence. */
  public A081023() {
    this('t');
  }

  @Override
  public Z next() {
    while (mA.charAt(++mN) == mLetter) {
      // do nothing
    }
    mA.append(English.SINGLETON.toOrdinalText(mN).replace(" and ", "").replaceAll("[- ,]", ""));
    //System.out.println(mA);
    return Z.valueOf(mN);
  }
}

