package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a023.A023900;
import irvine.oeis.a048.A048250;

/**
 * A066086 Greatest common divisor of product (p-1) and product (p+1), where p ranges over distinct prime divisors of n; a(n) = gcd(A048250(n), A173557(n)).
 * @author Sean A. Irvine
 */
public class A066086 extends Combiner {

  /** Construct the sequence. */
  public A066086() {
    super(1, new A048250(), new A023900(), Z::gcd);
  }
}
