package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A307430 Dirichlet g.f.: zeta(s) / zeta(4*s).
 * <code>a(p^e) = 1 if e &lt;= 3</code>, and 0 otherwise.
 * @author Georg Fischer
 */
public class A307430 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A307430() {
    super(1, (p, e) -> (e <= 3) ? Z.ONE : Z.ZERO);
  }
}
