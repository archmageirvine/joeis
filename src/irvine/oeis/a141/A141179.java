package irvine.oeis.a141;
// manually pricongrm/pricongr at 2023-08-13 

import irvine.math.z.Z;
import irvine.oeis.prime.CongruenceForm;

/**
 * A141179 Primes of the form 3*x^2 + 2*x*y - 3*y^2 (as well as of the form 3*x^2 + 8*x*y + 2*y^2).
 * @author Georg Fischer
 */
public class A141179 extends CongruenceForm {

  private int mN = 0;

  {
    // super.next();
  }

  /** Construct the sequence. */
  public A141179() {
    super(40, 0, 2, 3, 5, 13, 27, 37);
  }

  @Override
  public Z next() {
    return super.next();
    // return (++mN == 1) ? Z.SEVEN : super.next();
  }
}
