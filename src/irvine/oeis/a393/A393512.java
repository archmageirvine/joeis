package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393512 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A393512 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(2 * ++mN);
    final Z n2p1 = n2.add(1);
    return n2.pow(n2p1).add(1).divide(n2p1.square());
  }
}
