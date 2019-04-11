package irvine.oeis.a018;

/**
 * A018977 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite APC = AlPO4-C [ Al16P16O64 <code>] (1,2)</code>.
 * @author Sean A. Irvine
 */
public class A018977 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // APC
    return "a-1: a-13(000) a-9(0-+) b-8(0-0) a-7(0-0)\n"
      + "a-7: a-15(0+0) a-11(000)\n"
      + "b-8: b-12(++0)\n"
      + "a-9: b-16(0+0) a-15(0+0)\n"
      + "b-2: b-14(000) b-8(000) a-7(000) b-6(000)\n"
      + "b-6: b-10(000)\n"
      + "a-3: a-15(000) a-11(+00) b-6(000) a-5(+00)\n"
      + "a-5: a-13(-0-) a-9(000)\n"
      + "a-11: b-14(000) a-13(-00)\n"
      + "b-4: b-16(++0) b-8(00-) b-6(000) a-5(+00)\n"
      + "b-10: b-16(000) a-15(000) b-14(000)\n"
      + "b-12: b-16(00+) b-14(000) a-13(-00)\n";
  }
}

