package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A080518 The third, sixth, tenth, fifteenth, ... letters in this sentence are vowels (ignoring spaces and commas).
 * @author Sean A. Irvine
 */
public class A080518 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final String mLetter;
  private int mN = 0;

  protected A080518(final char letter, final String text) {
    mLetter = String.valueOf(letter);
    mA.append(' ').append(text);
  }

  protected A080518(final char letter) {
    this(letter, "the");
  }

  /** Construct the sequence. */
  public A080518() {
    this('e');
  }

  @Override
  public Z next() {
    mN = mA.indexOf(mLetter, mN + 1);
    mA.append(English.SINGLETON.toOrdinalText(mN).replace(" and ", "").replaceAll("[- ,]", "").replaceAll("[aiouy]", "e"));
    //System.out.println(mA);
    return Z.valueOf(mN);
  }
}

