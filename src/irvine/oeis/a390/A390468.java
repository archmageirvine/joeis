package irvine.oeis.a390;

import irvine.oeis.Combiner;
import irvine.oeis.a139.A139250;
import irvine.oeis.a147.A147562;

/**
 * A390468 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A390468 extends Combiner {

  /** Construct the sequence. */
  public A390468() {
    super(0, new A147562(), new A139250(), (a, b) -> a.add(b).divide2());
  }
}
