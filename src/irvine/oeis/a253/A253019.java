package irvine.oeis.a253;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A253019 Number of (n+2) X (2+2) 0..3 arrays with every consecutive three elements in every row and column not having exactly two distinct values, and in every diagonal and antidiagonal having exactly two distinct values, and new values 0 upwards introduced in row major order.
 * @author Georg Fischer
 */
public class A253019 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A253019() {
    super(1, "[0,37,50,83,-131,-167,-275,67,59,87,-6,-3]", "[1,0,0,-6,0,0,10,0,0,-3]");
  }
}
