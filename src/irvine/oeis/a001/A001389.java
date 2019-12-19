package irvine.oeis.a001;


/**
 * A001389 To get the 6th term, for example, note that 5th term has three (10 in <code>ternary!) 1</code>'s, one <code>(1) 0</code>, etc., giving <code>10 1 1 0 1 2 2 1 1 2</code>.
 * @author Sean A. Irvine
 */
public class A001389 extends A001387 {

  @Override
  protected String start() {
    return "2";
  }

  @Override
  protected int base() {
    return 3;
  }
}
