package irvine.oeis.a018;

/**
 * A018998 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite CHA = Chabazite Ca6[ Al12Si24O72 <code>] . 40</code> H2O.
 * @author Sean A. Irvine
 */
public class A018998 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // CHA
    return "a-1: a-12(-0+) a-10(000) a-6(000) a-5(-00)\n"
      + "a-5: a-9(000) a-8(+-0)\n"
      + "a-6: a-8(000) a-7(-0+)\n"
      + "a-2: a-12(000) a-11(+-0) a-5(000) a-4(0-0)\n"
      + "a-4: a-9(0+-) a-7(000)\n"
      + "a-3: a-11(000) a-10(0+-) a-6(00-) a-4(000)\n"
      + "a-7: a-12(000) a-11(+00)\n"
      + "a-9: a-12(00+) a-10(000)\n"
      + "a-8: a-11(000) a-10(0+0)\n";
  }
}

