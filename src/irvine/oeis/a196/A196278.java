package irvine.oeis.a196;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.French;

/**
 * A196278 Number of letters in the French ordinal numbers.
 * @author Georg Fischer
 */
public class A196278 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(French.SINGLETON.toOrdinalText(++mN).replaceAll("[ \\-]", "").length());
  }
}

