package irvine.oeis.a136;
// manually A136136/parm2 at 2023-03-13

/**
 * A136138 a(n+1)=sopfr(4a(n)+1), with sopfr=A001414. Finishes with the cycle (34, 137, 67, 269, 362, 36).
 * @author Georg Fischer
 */
public class A136138 extends A136136 {

  @Override
  public int getOffset() {
    return 0;
  }

  /** Construct the sequence. */
  public A136138() {
    super(4);
  }
}
