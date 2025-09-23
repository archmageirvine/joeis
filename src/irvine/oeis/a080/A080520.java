package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.French;

/**
 * A080520 Positions of the letter e (or \u00e8) in the French phrase enumerating these positions, "E est la premi\u00e8re, deuxi\u00e8me, neuvi\u00e8me, douzi\u00e8me, quatorzi\u00e8me, seizi\u00e8me, ... lettre dans cette phrase, o\u00f9 les espaces, les virgules et les traits d'union ne comptent pas.".
 * @author Sean A. Irvine
 */
public class A080520 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final String mLetter;
  private int mN = 0;

  protected A080520(final char letter, final String text) {
    mLetter = String.valueOf(letter);
    mA.append(' ').append(letter).append(text);
  }

  protected A080520(final char letter) {
    this(letter, "estla");
  }

  /** Construct the sequence. */
  public A080520() {
    this('e');
  }

  @Override
  public Z next() {
    mN = mA.indexOf(mLetter, mN + 1);
    mA.append(French.SINGLETON.toOrdinalText(mN).replaceAll("[- ,]", "").replace("centun", "centetun").replaceAll("\u00E8", "e"));
    if (mN == 1) {
      mA.append('e');
    }
    return Z.valueOf(mN);
  }
}

