package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A087163 Satisfies a(1)=1, a(2)=2, a(n+2)=a(n+1)+A087162(n)+1.
 * @author Sean A. Irvine
 */
public class A087163 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A087163() {
    super(1, 1, new A087162(), (n, k) -> n == 4 || !Z.THREE.equals(k));
  }
}
