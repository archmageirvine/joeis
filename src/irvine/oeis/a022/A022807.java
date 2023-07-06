package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001951;

/**
 * A022807 a(n) = S(n) + c(n) where S(n) = [ n*sqrt(2) ] + [ n*sqrt(3) ] and c is the complement of S.
 * @author Sean A. Irvine
 */
public class A022807 extends Combiner {

  private static final class MySequence extends Combiner {
    private MySequence() {
      super(new A022838(), new A001951().skip(1), ADD);
    }
  }

  /** Construct the sequence. */
  public A022807() {
    super(1, new MySequence(), new ComplementSequence(new MySequence(), Z.ONE), ADD);
  }
}
