package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A059437 Consider the last letter of each of the English words zero, one, two, three, four, five, ... . Write down 0 for a vowel or "y", 1 for a consonant.
 * @author Sean A. Irvine
 */
public class A059437 extends Sequence0 {

  private static final String V = "aeiouy";
  private int mN = -1;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toText(++mN);
    return V.indexOf(s.charAt(s.length() - 1)) >= 0 ? Z.ZERO : Z.ONE;
  }
}
