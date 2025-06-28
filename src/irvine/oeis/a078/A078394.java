package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a004.A004154;

/**
 * A078394 Numbers n such that reverse(A004154(n)) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A078394 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078394() {
    super(1, new A004154().skip(), k -> Functions.REVERSE.z(k).add(1).isProbablePrime());
  }
}

