package irvine.oeis.a196;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;

/**
 * A196278 Number of letters in the French ordinal numbers.
 * @author Georg Fischer
 */
public class A196278 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(French.SINGLETON.toOrdinalText(++mN).replaceAll("[ \\-]", "").length());
  }
}

