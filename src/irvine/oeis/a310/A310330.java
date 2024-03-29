package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310330 Coordination sequence Gal.6.73.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310330 extends TilingSequence {

  /** Construct the sequence. */
  public A310330() {
    super(0, new String[]
        { "6.6.6;B60+2,B180+2,B300+2"
        , "6.6.3.3;C300+3,A300+1,D60+1,E0+3"
        , "6.6.3.3;D60+2,C180+2,B60+1,E60+2"
        , "6.3.3.3.3;B300+3,C300+1,E0+1,F180+4,E300+4"
        , "3.3.3.3.3.3;D0+3,C300+4,B0+4,D60+5,F240+3,F180+5"
        , "6.3.3.3.3;F60+2,F300+1,E120+5,D180+4,E180+6"
        });
    defineBaseSet(0);
  }
}
