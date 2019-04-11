package irvine.oeis.a003;

/**
 * A003126 Value of <code>an</code> urn with n balls of type <code>-1</code> and <code>n+1</code> balls of type <code>+1</code>.
 * @author Sean A. Irvine
 */
public class A003126 extends A003125 {

  @Override
  protected int delta() {
    return 1;
  }
}

