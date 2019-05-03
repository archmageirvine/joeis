package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A005606 Position of first letter of <code>n (in English)</code> in alphabet.
 * @author Sean A. Irvine
 */
public class A005606 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.toEnglish(++mN).charAt(0) - '`');
  }
}

