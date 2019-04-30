package irvine.oeis.a305;

import irvine.oeis.FiniteSequence;

/**
 * A305257 If <code>pd(x)</code> is the product of the digits of the number x and <code>sd(x)</code> the sum of the digits of the number x then the sequence lists all the positive numbers n for which <code>pd(n) = sd(n)</code> and <code>sd(pd(n)) = pd(sd(n))</code>.
 * @author Georg Fischer
 */
public class A305257 extends FiniteSequence {

  /** Construct the sequence. */
  public A305257() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 123, 132, 213, 231, 312, 321, 1124, 1142, 1214, 1241, 1412, 1421, 2114, 2141, 2411, 4112, 4121, 4211, 11133, 11222, 11313, 11331, 12122, 12212, 12221, 13113, 13131, 13311, 21122, 21212, 21221, 22112, 22121, 22211, 31113, 31131, 31311, 33111);
  }
}
