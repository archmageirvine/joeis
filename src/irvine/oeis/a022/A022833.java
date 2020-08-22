package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A022833 a(0)=2; thereafter a(n) = a(n-1) + prime(n) if a(n-1) &lt; prime(n), otherwise a(n) = a(n-1) - prime(n). Cf. A008348.
 * @author Sean A. Irvine
 */
public class A022833 extends PrependSequence {

  /** Construct the sequence. */
  public A022833() {
    super(new A022831() {
      @Override
      protected Z first() {
        return Z.TWO;
      }
    }, 2, 0);
  }
}
