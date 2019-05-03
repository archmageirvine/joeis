package irvine.oeis.a009;

/**
 * A009302 If a, b are in the sequence, so is <code>ab+3</code>.
 * @author Sean A. Irvine
 */
public class A009302 extends A009293 {

  @Override
  protected long add() {
    return 3;
  }
}
