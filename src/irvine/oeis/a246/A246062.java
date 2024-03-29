package irvine.oeis.a246;
// Generated by gen_seq4.pl holon at 2023-12-14 17:23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A246062 G.f.: sqrt( (1 + sqrt(1+8*x)) / (1 + sqrt(1-8*x)) ).
 * ((1+(1+8*x)^(1/2))/(1+(1-8*x)^(1/2)))^(1/2)
 * @author Georg Fischer
 */
public class A246062 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A246062() {
    super(0, "[[0],[778567680,-600047616,172752896,-22020096,1048576],[0],[-7960320,7348224,-2453504,344064,-16384],[0],[7620,-10624,3904,256,-256],[0],[0,1,-1,-4,4]]", "1,2,2,28,54,860,2004,33720,86054", 0, OGF);
  }
}
