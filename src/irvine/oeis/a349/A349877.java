package irvine.oeis.a349;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A349877 a(n) is the number of times the map x -&gt; A353314(x) needs to be applied to n to reach a multiple of 3, or -1 if the trajectory never reaches a multiple of 3.
 * @author Gregory Morse
 */
public class A349877 extends LambdaSequence {
  /** Construct the sequence. */
  public A349877() {
    super(0, n -> A349876.firstMultiple(Z.valueOf(n), true));
  }
}
