package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010865 Constant sequence: <code>a(n) = 26</code>.
 * @author Sean A. Irvine
 */
public class A010865 implements Sequence {

  private static final Z N = Z.valueOf(26);

  @Override
  public Z next() {
    return N;
  }
}

