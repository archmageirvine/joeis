package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312170 Coordination sequence Gal.5.231.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312170 extends TilingSequence {

  /** Construct the sequence. */
  public A312170() {
    super(0, new String[]
        { "6.6.3.3;A300+3,B180+2,A60+1,C0+3"
        , "6.6.3.3;D60+2,A180+2,E60+1,D240+4"
        , "3.3.3.3.3.3;A240+4,A300+4,A0+4,A60+4,A120+4,A180+4"
        , "6.3.3.3.3;E60+2,B300+1,D180+3,B120+4,E180+5"
        , "6.3.3.3.3;B300+3,D300+1,E120+4,E240+3,D180+5"
        });
    defineBaseSet(0);
  }
}
