package irvine.oeis.a050;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a048.A048853;

/**
 * A050662 a(n) is smallest number such that number of primes produced according to rules stipulated in Honaker's A048853 is n.
 * @author Sean A. Irvine
 */
public class A050662 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050662() {
    super(new A048853());
  }
}
