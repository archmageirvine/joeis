package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035992 Number of partitions of n into parts not of the form <code>23k, 23k+4</code> or <code>23k-4</code>. Also number of partitions with at most 3 parts of size 1 and differences between parts at distance 10 are greater than 1.
 * @author Georg Fischer
 */
public class A035992 extends EulerTransform {

  /** Construct the sequence. */
  public A035992() {
    super(new PeriodicSequence(1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0), new Z[0]);
  }
}
