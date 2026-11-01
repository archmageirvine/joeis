package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A087160 Satisfies a(1)=1, a(2)=2, a(n+2)=a(n+1)+A087159(n)+1.
 * @author Sean A. Irvine
 */
public class A087160 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A087160() {
    super(1, 1, new A087159(), (n, k) -> n <= 2 || !Z.TWO.equals(k));
  }
}
