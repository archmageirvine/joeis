package irvine.oeis.a057;

import irvine.oeis.triangle.Transpose;

/**
 * A057028 Triangle T read by rows: row n consists of the numbers C(n,2)+1 to C(n+1,2); numbers in odd-numbered places form a decreasing sequence and the others an increasing sequence.
 * numbers in odd-numbered places form a decreasing sequence and the others an increasing sequence.
 * @author Georg Fischer
 */
public class A057028 extends Transpose {

  /** Construct the sequence. */
  public A057028() {
    super(1, new A057027());
  }
}
