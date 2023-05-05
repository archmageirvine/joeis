package irvine.oeis.a324;
// manually partsum at 2023-05-03 22:39

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a323.A323351;

/**
 * A324914 a(n) = Sum_{k=1..n} 2^k * tau(k), where tau(k) = A000005(k).
 * @author Georg Fischer
 */
public class A324914 extends PartialSumSequence {

  /** Construct the sequence. */
  public A324914() {
    super(1, new A323351() {
      {
        super.next();
      }
    });
  }
}
