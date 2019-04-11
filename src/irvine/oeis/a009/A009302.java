package irvine.oeis.a009;

/**
 * A009302 If <code>a,</code> b are in the sequence, so is ab+3.
 * @author Sean A. Irvine
 */
public class A009302 extends A009293 {

  @Override
  protected long add() {
    return 3;
  }
}
