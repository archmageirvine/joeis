package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-10-02.ack/holos at 2024-10-02 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A122951 Number of walks from (0,0) to (n,n) in the region x &gt;= y with the steps (1,0), (0,1), (2,0) and (0,2).
 * FindRE((2*x+sqrt(4*(x-2)*x+1) - sqrt(2)*sqrt(2*x*(-2*x + sqrt(4*(x-2)*x+1)-1) + sqrt(4*(x-2)*x+1)+1)+1)/(4*x^2), x, a(n));
 * @author Georg Fischer
 */
public class A122951 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122951() {
    super(0, "[[0], [13977600, -9272320, 2293760, -250880, 10240], [-51993600, 41374720, -12256000, 1602560, -78080], [57131520, -58355264, 21948672, -3615616, 220608], [-11520000, 21567456, -12724288, 3059904, -261632], [-8674800, 9027632, -2568736, -28832, 67216], [2129400, -4645336, 3424368, -1002944, 94512], [0, 194056, -406228, 268184, -56012], [0, 10860, -9640, -10860, 9640], [0, 1050, 525, -1050, -525]]", "1, 1", 0, 0);
  }
}
