package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010866 Constant sequence: <code>a(n) = 27</code>.
 * @author Sean A. Irvine
 */
public class A010866 implements Sequence {

  private static final Z N = Z.valueOf(27);

  @Override
  public Z next() {
    return N;
  }
}

