package irvine.oeis.a092;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000079;
import irvine.oeis.a067.A067076;

/**
 * A092176 a(n) = A067076(n) + A000079(n)/2 with A067076(0)=0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A092176 extends Combiner {

  /** Construct the sequence. */
  public A092176() {
    super(0, new A067076().prepend(0), new A000079(), (a, b) -> a.add(b.divide2()));
  }
}
