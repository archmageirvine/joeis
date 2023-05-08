package irvine.oeis.a137;
// manually moderiv at 2023-05-07 09:42

import irvine.math.z.Z;
import irvine.oeis.a014.A014138;

/**
 * A137993 A014138 (= partial sums of Catalan numbers starting with 1,2,5) mod 3.
 * @author Georg Fischer
 */
public class A137993 extends A014138 {

  /** Construct the sequence. */
  public A137993() {
    super();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(3));
  }
}
