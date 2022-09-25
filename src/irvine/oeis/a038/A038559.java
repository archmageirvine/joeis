package irvine.oeis.a038;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a040.A040027;

/**
 * A038559 a(n) = 2*A040027(n-1) + Bell(n), where Bell = A000110.
 * @author Sean A. Irvine
 */
public class A038559 extends Combiner {

  /** Construct the sequence. */
  public A038559() {
    super(new A000110(), new PrependSequence(new A040027(), 0), (a, b) -> a.add(b.multiply2()));
  }
}
