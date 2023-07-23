package irvine.oeis.a046;

/**
 * A046722 Number of semi-meanders of order n with 3 components.
 * @author Sean A. Irvine
 */
public class A046722 extends A046721 {

  {
    setOffset(3);
  }

  @Override
  protected int components() {
    return 3;
  }
}
