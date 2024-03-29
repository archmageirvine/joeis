package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310124 Coordination sequence Gal.6.67.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310124 extends TilingSequence {

  /** Construct the sequence. */
  public A310124() {
    super(0, new String[]
        { "6.6.6;B60+2,B180+2,B300+2"
        , "6.6.6;C60+2,A300+1,C180-2"
        , "6.6.3.3;D240+4,B300+1,E60+1,C60-4"
        , "6.3.6.3;C180-1,C300+1,C0-1,C120+1"
        , "6.3.6.3;C300+3,F300+1,F240+2,C0-3"
        , "6.3.6.3;E60+2,E120+3,F60+4,F300+3"
        });
    defineBaseSet(0);
  }
}
