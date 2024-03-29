package irvine.oeis.a151;
// Generated by gen_seq4.pl build/parm6 at 2022-05-28 00:05

/**
 * A151847 a(0)=1; a(1)=0; a(2)=1; for n&gt;=3 if n=2^i + j with 0&lt;=j&lt;2^i then a(n)=a(j) + a(j + 1) except we add 1 if j=2^i-1.
 * @author Georg Fischer
 */
public class A151847 extends A151843 {

  /** Construct the sequence. */
  public A151847() {
    super(1, 0, 1, 1, 1);
  }
}
