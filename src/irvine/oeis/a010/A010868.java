package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010868 Constant sequence: <code>a(n) = 29</code>.
 * @author Sean A. Irvine
 */
public class A010868 implements Sequence {

  private static final Z N = Z.valueOf(29);

  @Override
  public Z next() {
    return N;
  }
}

