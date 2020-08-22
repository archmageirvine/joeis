package irvine.oeis.a003;

/**
 * A003126 Value of an urn with n balls of type -1 and n+1 balls of type +1.
 * @author Sean A. Irvine
 */
public class A003126 extends A003125 {

  @Override
  protected int delta() {
    return 1;
  }
}

