package irvine.oeis.a120;
// Generated by gen_seq4.pl build/parm6 at 2022-06-14 21:39

/**
 * A120604 G.f. satisfies: 24*A(x) = 23 + 64*x + A(x)^8, starting with [1,4,28].
 * @author Georg Fischer
 */
public class A120604 extends A120602 {

  /** Construct the sequence. */
  public A120604() {
    super(24, 16, 64, 8, 1, 4, 28);
  }
}
