package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.French;

/**
 * A080519 Positions of the letter t in the French phrase enumerating these positions, "T est la premi\u00e8re, quatri\u00e8me, dix-huiti\u00e8me, trenti\u00e8me, trente-cinqui\u00e8me,... lettre dans cette phrase...".
 * @author Sean A. Irvine
 */
public class A080519 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final String mLetter;
  private int mN = 0;

  protected A080519(final char letter, final String text) {
    mLetter = String.valueOf(letter);
    mA.append(' ').append(letter).append(text);
  }

  protected A080519(final char letter) {
    this(letter, "estla");
  }

  /** Construct the sequence. */
  public A080519() {
    this('t');
  }

  @Override
  public Z next() {
    mN = mA.indexOf(mLetter, mN + 1);
    mA.append(French.SINGLETON.toOrdinalText(mN).replaceAll("[- ,]", "").replace("centun", "centetun"));
    if (mN == 1) {
      mA.append('e');
    }
    return Z.valueOf(mN);
  }
}

