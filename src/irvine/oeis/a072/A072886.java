package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A072886 The s-aints, numbers generated like the Aronson series from a generating sentence, "S ain't the second, third, fourth, fifth . . . letter of this sentence.".
 * @author Sean A. Irvine
 */
public class A072886 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final char mLetter;
  private int mN = 0;

  protected A072886(final char letter) {
    mLetter = letter;
    mA.append(' ').append(letter).append("aintthe");
  }

  /** Construct the sequence. */
  public A072886() {
    this('s');
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

