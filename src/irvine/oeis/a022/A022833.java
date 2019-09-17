package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A022833 <code>a(0)=2</code>; thereafter <code>a(n) = a(n-1) + prime(n)</code> if <code>a(n-1) &lt; prime(n)</code>, otherwise <code>a(n) = a(n-1) - prime(n)</code>. Cf. <code>A008348</code>.
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
