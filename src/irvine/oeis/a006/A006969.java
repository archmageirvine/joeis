package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;

/**
 * A006969 Number of characters in French ordinal numbers.
 * @author Georg Fischer
 */
public class A006969 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(French.SINGLETON.toOrdinalText(++mN).length());
  }
}

