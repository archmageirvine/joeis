package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004462 Nimsum n + 21.
 * @author Sean A. Irvine
 */
public class A004462 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 21);
  }
}

