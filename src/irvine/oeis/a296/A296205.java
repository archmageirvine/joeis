package irvine.oeis.a296;
// manually insect/insect2s at 2022-02-24 19:13

import irvine.oeis.IntersectionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004709;
import irvine.oeis.a007.A007774;

/**
 * A296205 Numbers k such that Product_{d|k^2, gcd(d,k^2/d) is prime} gcd(d,k^2/d) = k^2.
 * @author Georg Fischer
 */
public class A296205 extends PrependSequence {

  /** Construct the sequence. */
  public A296205() {
    super(new IntersectionSequence(new A004709(), new A007774()), 1);
  }
}
