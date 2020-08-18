package irvine.oeis.a103;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A103260 Number of partitions of <code>2n</code> prime to 3 with all odd parts occurring with multiplicity 2. The even parts occur with multiplicity 1.
 * @author Georg Fischer
 */
public class A103260 extends EulerTransform {

  /** Construct the sequence. */
  public A103260() {
    super(new PeriodicSequence(2, -1, 0, 0, 2, 0, 2, 0, 0, -1, 2, 0), 1);
  }
}
